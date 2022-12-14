package br.com.sicredi.dto;

import java.io.Serializable;

public class DadosContaRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String agencia;
	private String conta;
	private Double saldo;
	private String status;

	public DadosContaRequestDTO() {

	}

	public DadosContaRequestDTO(String agencia, String conta, Double saldo, String status) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.status = status;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DadosContaRequest [agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + ", status=" + status
				+ "]";
	}

}
