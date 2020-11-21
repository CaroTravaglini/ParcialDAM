package isi.dam.parcialdam;

public class Profesor {
    private Integer IdProfesor;
    private String nombre;

    public Profesor (Integer idProfesor, String nombre){
        this.IdProfesor = IdProfesor;
        this.nombre = nombre;
    }

    public Integer getIdProfesor (){
        return IdProfesor;
    }

    public String getNombre (){
        return nombre;
    }
}
