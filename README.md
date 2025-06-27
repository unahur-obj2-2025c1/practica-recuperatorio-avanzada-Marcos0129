# Taller Mecánico

Con los muchachos de la materia decidimos abrir un taller mecánico que brinda una solución general para cualquier vehículo. El circuito del negocio se describe a continuación.

## Ingreso de un Vehículo

Cuando viene un auto se toman los datos de

- la patente (Es un string pero siempre termina en un número)
- el kilometraje
- la marca y modelo de auto. Por ejemplo: “Volkswagen” es la marca, y el modelo puede ser “Gol Trend”, “Gol Power”, “Suran”, “Gol Trend 2 puertas”, etc.
- el desgaste que tienen la suspensión delantera y trasera, que se mide en porcentaje (diferente para cada suspensión)
- el grado de desgaste de cada cubierta, que se mide en mm (a menor mm mayor desgaste)

## Orden de Trabajo

Una vez tomado los datos en recepción del vehiculo, se debe generar una orden de trabajo para ese vechiculo y asignar (si es posible), un técnico que pueda hacer el trabajo. Para que un técnico puede ser asignado a un orden de trabajo , deben cumplirse las preferencias de los técnicos, que son las siguientes:

- algunos aceptan cualquier auto
- algunos solo quieren atender una determinada marca, como “Ford” o “Chevrolet”
- otros no quieren autos con más de un cierto kilometraje (ej.: 100.000 kms.)
- otros quieren que la patente termine en un número par
  Se pueden agregar o eliminar nuevas preferencias a futuro, así que se pide que la solución que brinde sea lo suficientemente flexible. También necesitamos poder combinar con AND / OR varias preferencias. Por ejemplo, alguien quiere autos “Ford” que tengan menos de 50.000 kms. Otro quiere que la patente termine en un número par o que el auto sea “Corolla”.

En caso de no poder asignar automáticamente, la orden de trabajo debe generarse sin técnico y luego se podrá asignar a un técnico de manera manual.

## Servicios a realizar

A cada orden de trabajo se le registran los servicios que se deberan realizar sobre el vehiculo. Los trabajos sobre el vechiculo serán realizados una vez que la orden de trabajo este aprobada y el taller la envie a ejecutar.

Por el momento contamos con siguientes servicios:

- Reparar suspensión: se indica qué suspensión está involucrada (delantera o trasera).
- Reparar Cubiertas: se indica todas las cubiertas a mejorar (delantera izquierda, delantera derecha, trasera izquierda y/o trasera derecha), de mínimo es una y de máxima todas, pero deben estar bien identificadas.
- rotación de cubiertas

Cuando la orden de trabajo es aprobada y el taller lanza la orden de trabajo se procede a ejecutar los servicios:

- suspensión: la suspensión involucrada pasa a tener un desgaste de 0%
- reparación de cubiertas: se deben reparar la cubiertas indicadas y llevarlas a un desgaste inicial de 8 mm
- rotación de cubiertas: las cubiertas delanteras pasan a estar en las traseras y viceversa

## Costo del Servicio

Cada servicio tiene un precio base que depende del modelo del auto. Por ejemplo, el “Gol Trend 2 puertas” tiene un precio base de $ 250, al que se le suma el valor propio de cada mejora:

- para la suspensión es 1500 para la suspención delanter y 1200 para la suspencion delantera.
- para la reparación de cubiertas es $ 200 por cubierta
- para la rotación son $ 200 en general
