package com.sw.banca.service;

import org.springframework.stereotype.Component;

@Component
public class AutorizeService {
/*
	public boolean letAccess() {
		boolean rpta = false;

		String metodoRoles[] = "ADMINISTRADOR,CLIENTE".split(",");

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {

			System.out.println(authentication.getName());

			for (GrantedAuthority auth : authentication.getAuthorities()) {
				String rolUser = auth.getAuthority();

				System.out.println(rolUser);

				for (String rolMet : metodoRoles) {
					if (rolUser.equalsIgnoreCase(rolMet)) {
						rpta = true;
					}
				}
			}
		}
		return rpta;
	}
	*/
}
