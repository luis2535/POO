package dados;

public enum PotenciaMotor {
	MOTOR10(new Motor10()),MOTOR12(new Motor12()),MOTOR14(new Motor14()),MOTOR16(new Motor16()),MOTOR18(new Motor18()), MOTOR20(new Motor20());
	private Motor tipo;
	private PotenciaMotor(Motor motor) {
		this.tipo = motor;
	}
	public Motor getMotor() {
		return this.tipo;
	}
}
