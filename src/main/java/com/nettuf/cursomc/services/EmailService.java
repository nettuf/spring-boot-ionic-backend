package com.nettuf.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.nettuf.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
