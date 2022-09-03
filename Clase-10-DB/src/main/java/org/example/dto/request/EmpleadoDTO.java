package org.example.dto.request;

public class EmpleadoDTO extends PersonaDTO {

    private Integer idEmpleado;
    private Double sueldo;


    public EmpleadoDTO() {
    }

    public EmpleadoDTO(String nombre, String apellido, Integer edad, String direccion, Integer idEmpleado, Double sueldo) {
        super(nombre, apellido, edad, direccion);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
