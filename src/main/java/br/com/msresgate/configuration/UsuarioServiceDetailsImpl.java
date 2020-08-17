package br.com.msresgate.configuration;

import br.com.msresgate.domain.entities.Permissao;
import br.com.msresgate.domain.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UsuarioServiceDetailsImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var usuario= repository.findByEmail(username).get();

        if(usuario == null) {
            throw new UsernameNotFoundException("Usuário não cadastrado");
        }
        return new UsuarioLogin(usuario.getEmail(), usuario.getSenha(), authorities(usuario.getPermissoes()));
    }

    public Collection<? extends GrantedAuthority> authorities(Set<Permissao> permissoes) {
        return permissoes.stream()
                .map(permissao -> new SimpleGrantedAuthority(permissao.getNome()))
                .collect(Collectors.toList());
    }


}
