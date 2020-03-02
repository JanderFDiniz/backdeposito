package com.deposito.diniz.controller;

import com.deposito.diniz.cliente.ClienteDto;
import com.deposito.diniz.cliente.entity.Cliente;
import com.deposito.diniz.cliente.service.ClienteService;
import com.deposito.diniz.venda.VendaDto;
import com.deposito.diniz.venda.entity.Venda;
import com.deposito.diniz.venda.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CaixaController {

    @Autowired
    private VendaService vendaService;

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "/cliente", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveCliente(@RequestBody ClienteDto clienteDto) {
        clienteService.insertTest(clienteDto);
    }

    @RequestMapping(value = "/clientes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Cliente>> getClientes() {
        return new ResponseEntity<>(clienteService.getClientes(), HttpStatus.OK);
    }

   // @RequestMapping(value = "/vendaDia", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<Venda> vendaDia(@RequestParam("id")Integer id){

        //Venda venda = vendaService.getVendas();

       // return new ResponseEntity(venda, HttpStatus.OK);
    //}

    @RequestMapping(value = "/adicionarVenda", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void salvarVenda(@RequestBody VendaDto vendaDto){

        vendaService.saveVenda(vendaDto);
    }

    @RequestMapping(value = "/vendas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Venda>> getVendas() {
        return new ResponseEntity<>(vendaService.getVendas(), HttpStatus.OK);
    }

    @RequestMapping(value = "/editVenda", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void editarVenda(@RequestBody VendaDto vendaDto){

    }

}
