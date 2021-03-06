# EDA22A-Lab05
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Laboratorio de Estructura de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Arboles</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>05</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN</td><td>28-Jun-2022</td><td colspan="2">HORA DE PRESENTACIÓN: </td><td>11 pm</td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Umasi Cariapaza, Carlos Daniel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</tdbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">SOLUCIÓN Y RESULTADOS</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS
            <ol>
            <li>Corchetes equilibrados<br>
            <p>Para hacer uso de los corchetes equilibrados se utilizó el siguiente código:<p>
            <pre>
boolean cond=false;
if(a.length()%2!=0)
	return cond;
for(int i=0;i < a.length()/2;i++) {
	if(a.substring(i,i+1).equals("[") && a.substring(a.length()-1,a.length()).equals("]")) 
	    cond = true;
	else if(a.substring(i,i+1).equals("(") && a.substring(a.length()-1,a.length()).equals(")")) 
	    cond = true;
	else if(a.substring(i,i+1).equals("{") && a.substring(a.length()-1,a.length()).equals("}")) 
		cond = true;
	else 
		cond = false;	
}
return cond;</pre>
            <p>El cual verifica los si los corchetes estan o no equilibrados</li>
            <li>Árbol AVL:<br>
            <p>Se testeo el árbol con el siguiente codigo y dio como resultado esto:</p>
            <pre>
Integer[] data = {100,200,300,400,50,25,350,365,120};
for (Integer i : data) {
    b.insert(i);
}
System.out.println(b);
b.remove(100);
System.out.println(b);
System.out.println(b.search(200));
System.out.println(b);</pre>
            <pre>
25, 50, 120, 100, 200, 300, 365, 350, 400,       
25, 50, 120, 200, 300, 365, 350, 400,
200                                    
25, 50, 120, 200, 300, 365, 350, 400,</pre>
            </ol>
            </td> 
        </tr>
        <tr>
            <td>
            III. CONCLUSIONES<br>
                <ul>
                    <li>Los árboles AVL son muy útiles a la hora de buscar elementos pues tienen un orden de ramas las cuales reducen en gran medida el tiempo de búsqueda.</li>
                    <li>Los árboles AVL se mantienen equilibrados con su factor de equilibrio y cuando este se ve alterado pueden realizar diferentes rotaciones para poder conservar el equilibrio.</li>
                </ul>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">RETROALIMENTACIÓN GENERAL</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">REFERENCIAS Y BIBLIOGRAFÍA</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
                -Escobedo, R., 2022. pw2/labs/lab03 at main · rescobedoq/pw2. [online] GitHub. Available at: https://github.com/rescobedoq/pw2/tree/main/labs/lab03.<br>
                -https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html<br>
                -https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html<br>
                -https://javaplot.panayotis.com/example.html<br> 
            </td>
        </tr>
    </tbody>
</table>