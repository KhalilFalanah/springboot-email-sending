package br.com.khalil.emailsending.controller;

import br.com.khalil.emailsending.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.
        RequestParam;

@Controller
public class FormController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/enviar-email")
    public String enviarEmail(@RequestParam("email") String email) {
        String corpoEmail = "Sua Mensagem Aqui";

        emailService.enviarEmail(email, "Seu Assunto Aqui", corpoEmail);

        return "redirect:/confirmacao";
    }
}