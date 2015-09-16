//x1 assignment//
//Matthew Testa (CST 112; 9/11/15)

//GLOBALS point plot and speed
float x, y;
float dx, dy;
float horizon;

//SETUP: size
void setup() {
  size (800, 550);
  horizon = height/3;
  x = width/2;
  y = height/2;
  dx = 4;
  dy = 5;
}

//SCENE: objects and shapes
void draw() {
  background(230, 200, 200); // sky //
  
  fill(250, 200, 100); 
  ellipse( width*4/5, height/9, 65,65); // sun //
  
  fill( 130,230, 120);
  rect(0, horizon, width, height*4/5); // grass // 
 
  fill(200,100,60); //tree//
  rect( 100, horizon, width/35, -height/4 );
  fill(80,240,20);
  triangle(60, horizon-40, 110, horizon-140, 160, horizon-40);
  triangle(80, horizon-100, 110, horizon-160, 140, horizon-100);
  
  fill(140, 60, 120); //house//
  rect(270, horizon, width/5, -height/6);
  fill(255,0,0);
  rect(335, horizon, width/35, -height/12);
  
  fill(0);
  text( "Matt Testa", 700, height/3); 
  
  x= x + dx;
  y= y + dy;

fill(255);  
ellipse(x,y, 80,65);

//eyes//
fill(180); 
ellipse(x-15,y-5, 20,20);
fill(180);
ellipse(x+15,y-5, 20,20);

//mouth//
fill(200,0,0);
rect(x,y+8, 40,25);

//teeth//
fill(255,255,255);
rect(x,y+8, 10,5);
rect(x+30,y+8, 10,5);
  
fill(0);
text( "Ralph", x,y+50);

}

//speed, mouse clicks, exit//
void mousePressed() {
  x= mouseX;
  y= mouseY;
  //speed//
  dx= random( -1, +4);
  dy= random( -2, +3);
}
