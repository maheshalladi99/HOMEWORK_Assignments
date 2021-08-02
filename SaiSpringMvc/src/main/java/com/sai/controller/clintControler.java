package com.sai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sai.Dao.ClientDao;

import com.sai.model.Client;

@Controller
public class clintControler {
	@Autowired
	ClientDao clientdao;


	@GetMapping(value = "/showClients")
	public String showClients() {

		return "clients";
	}
	@GetMapping(value = "/registerhere")
	public String showClient(Model model) {
		Client client=new Client();
		model.addAttribute("client", client);
		return "Register page";
	}
	@ResponseBody
	@PostMapping(value = "/saveDetail")
	public String SaveClient(Client client) {
		clientdao.saveClient(client);
		return "Registered";
	}
}
