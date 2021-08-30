import scala.io.StdIn.readInt
import scala.math.sqrt

object caseClass{

  case class Point(a:Int, b:Int){
    def x:Int = a;                   //Initializing x and y coordinates
    def y:Int = b;

    def add(p:Point) = Point(x+p.x, y+p.y);       //adding two points

    def move(dx:Int, dy:Int)=Point(x+dx, y+dy);      //moving a point by the distance dx and dy specified

    def distance(p:Point) : Double= {
      scala.math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));     //calculating the distance between two points using Pythagoras theorem
    }

    def invert = Point(y, x);         //switching x and y coordinates
  }

  def main(args:Array[String]){
    var p1 = Point(2,4);
    println(p1);                 //output = Point(2,4)

    var p2 = Point(3,-1);
    println(p2.add(p1));        //output = Point(5,3)

    p1 = p1.move(1,-3);
    println(p1);              //output = Point(3,1)

    var p3 = Point(1,2);

    println(p1.distance(p3));     //output = 2.23606797749979

    var p4 = Point(1,8);
    p4 = p4.invert;             //output = Point(8,1)
    print(p4);
  }
}
