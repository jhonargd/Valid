package com.prueba.valid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.valid.model.Registro;
import com.prueba.valid.service.IRegistroService;

@Controller
public class RegistroController {
	
	@Autowired
	private IRegistroService service;

	@GetMapping("/registros")
	public String listarRegistros(Model model) {
		model.addAttribute("registros", service.listarRegistros());
		return "index";
	}
	
	@PostMapping("/registros")
	public String updateRegistros(@RequestParam(required=false,name="selected")int[] checkboxValue) {
		if (checkboxValue!=null)
		     for (int val: checkboxValue) {
		    	service.editRegistro(val);
		    }
		return "redirect:/registros";
	}
	
	@GetMapping("/add")
	public String agregarRegistro() {
		return "addView";
	}
	
	@PostMapping("/add")
	public String addRegistro(@Validated Registro registro) {
		service.addRegistro(registro);
		return "redirect:/registros";
	}
	
}
