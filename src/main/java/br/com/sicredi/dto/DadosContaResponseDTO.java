package br.com.sicredi.dto;

public class DadosContaResponseDTO {

	private String agencia;
	private String conta;
	private Double saldo;
	private String status;
	private boolean enviado;

	public DadosContaResponseDTO() {
	}
	
	public DadosContaResponseDTO(String agencia, String conta, Double saldo, String status, boolean enviado) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.status = status;
		this.enviado = enviado;
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

	public boolean isEnviado() {
		return enviado;
	}

	public void setEnviado(boolean enviado) {
		this.enviado = enviado;
	}

	@Override
	public String toString() {
		return "DadosContaResponse [agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + ", status=" + status
				+ ", enviado=" + enviado + "]";
	}
	
	

}
