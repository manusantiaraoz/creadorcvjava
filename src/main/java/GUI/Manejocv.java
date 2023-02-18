/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;


import java.awt.Desktop;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.net.URISyntaxException;


/**
 *
 * @author manusanti
 */
public class Manejocv {
    
//atributo
     ArrayList<Curriculum>curri;

    public Manejocv() {
    curri= new ArrayList<>();
    }
    
    public Curriculum obtener (int pos){
        return curri.get(pos);
    }
    
    public void agregar(Curriculum x){
    curri.add(x);
    };
    
    //funcion para verificar el que no se envien campos vacios.
//public String verify (ArrayList x, String n){
//    String content="";
//if(x(0).isEmpty()){
//    JOptionPane.showMessageDialog(null,"el campo "+ n + " no puede quedar sin completar");
//    System.exit(1);
//}else{
//    content = x.;
//}
//return content;
//}
    
    
    public void crear(){
        String nombre="", apellido, descripcion, perfil, direccion, email, resp, linkedin, carrera, institucion, cursos,
                idiomas, nivel, skill1, skill2, skill3, skill4, skill5, exp,  edad, cel;
    File f = new File("cv.html");
    try{
      BufferedWriter bw = new BufferedWriter(new FileWriter(f));
      
      if(obtener(0).getNombre().isEmpty()){
          JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE SER NULO");
          System.out.println("campo nulo");
          
      }else{
          nombre= obtener(0).getNombre();
      };

      apellido = obtener(0).getApellido();
      perfil =obtener(0).getPerfil();
      descripcion =obtener(0).getDescripcion() ;
      edad =obtener(0).getEdad();
      direccion = obtener(0).getDireccion();
      cel = obtener(0).getCel();
      email = obtener(0).getEmail();
      linkedin = obtener(0).getLinkedin();
      
      carrera = obtener(0).getCarrera();
      institucion = obtener(0).getInstitucion();
      cursos = obtener(0).getCursos();
      idiomas = obtener(0).getIdiomas();
      nivel = obtener(0).getNivel();
      skill1 = obtener(0).getSkill1();
      skill2 = obtener(0).getSkill2();
      skill3 = obtener(0).getSkill3();
      skill4 = obtener(0).getSkill4();
      skill5 = obtener(0).getSkill5();
      exp = obtener(0).getExp();
       
      String html5 = "<!DOCTYPE html>"
                    + "<html lang='en'>"
                    + "<head>"
                    + "  <meta charset='UTF-8' />"
                    + "  <meta http-equiv='X-UA-Compatible' content='IE=edge' />"
                    + "  <meta name='viewport' content='width=device-width, initial-scale=1.0' />"
                    + "  <title>CV Creator</title>"
                    + "  <link rel='stylesheet' href='reset.css' />"
                    + "  <link rel='stylesheet' href='estilos.css' />"
                    + "</head>"
                    + "<body>"
                    + "  <div id='caja'>"
                    +"<header>"
                    + "    <h1 id='names'>" + nombre + " " + apellido + "</h1>"
                    + "    <span><span id='negrita'>" + perfil + "</span></span>"
                    + "    <p>" + descripcion + "</p>"
                    +"</header>"
                    +"<main>"
                    + "    <fieldset>"
                    + "      <legend>Datos Personales</legend>"
                    + "      <ul>"
                    + "        <li><span><span id='negrita'>Edad: </span>" + edad + "</span></li>"
                    + "        <li><span><span id='negrita'>Direccion: </span>" + direccion + "</span></li>"
                    + "        <li><span><span id='negrita'>Celular: </span>" + cel + "</span></li>"
                    + "        <li><span><span id='negrita'>Email: </span>" + email + "</span></li>"
                    + "        <li><span><span id='negrita'>Linkedin: </span></span> <a href='https://www.linkedin.com/in/" + linkedin + "/' target='_blank' rel='noopener noreferrer'>" + linkedin + "</a> </li>"
                    + "      </ul>"
                    + "    </fieldset>"
                    + "    <fieldset>"
                    + "      <legend>Formacion Academica</legend>"
                    + "      <ul>"
                    + "        <li><span><span id='negrita'>Carrera universitaria/superior: </span>" + carrera + " - " + institucion + "</span></li>"
                    + "        <li><span><span id='negrita'>Cursos realizados: </span>" + cursos + "</span></li>"
                    + "        <li><span><span id='negrita'>Idiomas: </span>" + idiomas + "-" + nivel + "</span></li>"
                    + "      </ul>"
                    + "    </fieldset>"
                    + "    <fieldset>"
                    + "      <legend>Stack de Habilidades y Tecnologias utilizadas</legend>"
                    + "      <ul>"
                    + "        <li>" + skill1 + "</li>"
                    + "        <li>" + skill2 + "</li>"
                    + "        <li>" + skill3 + "</li>"
                    + "        <li>" + skill4 + "</li>"
                    + "        <li>" + skill5 + "</li>"
                    + "      </ul>"
                    + "    </fieldset>"
                    + "    <fieldset>"
                    + "      <legend>Experiencia Laboral</legend>"
                    + "      <ul>"
                    + "        <li>" + exp + "</li>"
                    + "      </ul>"
                    + "    </fieldset>"
                    +"<h3 id= 'pie'> proyecto final Briz Franco-Santi Araoz Daniel Emmanuel </h3> "
                    +"</main>"
                    + "  </div>"
                    + "</body>"
                    + "</html>";

            bw.write(html5);
           JOptionPane.showMessageDialog(null,"Tu curriculum fue creado. exitos en tu busqueda");
           //da el nombre del archivo creado, para poder abrirlo 
           String dir = f.getName();
           
           //muestro el nombre del archivo
           JOptionPane.showMessageDialog(null,"----------- "+ "se abrira tu curriculum"+" -------------");
           
    //con una estructura condicional chequeo si la pc soporta el paquete desktop para luego preguntar si soporta el
    //la opcion de abrir el navegador (abre el que esta seleccionado por defecto), dentro de una estructura de 
    //manejo de ecepciones pruebo abrir la el archivo html en el navegador, de lo contrario atrapo la ecepcion en el
    //catch mandando un MessageDialog.
    if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if(desktop.isSupported(Desktop.Action.BROWSE)){
               try{
                   java.net.URI uri = new  java.net.URI(dir);
                   desktop.browse(uri);
               }catch(URISyntaxException ex){JOptionPane.showMessageDialog(null,"error en la apertura del archivo");}
        }
    
    }  
           bw.close();
           
    }catch(IOException ex){
        JOptionPane.showMessageDialog(null,"se produjo un error en la creacion del curriculum");
    }
    
    }

    
}
