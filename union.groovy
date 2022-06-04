import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere

double size =40;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
//create a sphere
CSG sphere = new Sphere(size/20*12.5).toCSG()
// perform a union
CSG cubePlusSphere = cube.union(sphere);
CSG simpleSyntax =new Cylinder(20,40).toCSG() // a one line Cylinder
.movez(45)
//To union a list of CSG's together use the static unioAll
CSG allUnion = CSG.unionAll([simpleSyntax,cubePlusSphere , cube.movex(size*1.5), sphere.movey(size*1.5)])

return allUnion