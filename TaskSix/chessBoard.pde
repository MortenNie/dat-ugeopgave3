int [] [] board = new int [8][8];
int sideLength = 40;

void setup(){
  size(320,320);
 for (int x = 0; x < board.length; x++) {
  for (int y = 0; y < board.length; y++) {
    if ((x + y + 1) % 2 == 0) {
      board[x][y] = 0;
    } else {
      board[x][y] = 1;
    }
    
  }
   
 }
}
void draw() {
  for (int x = 0; x < board.length; x = x + 1) {
   for (int y = 0; y < board.length; y = y + 1) {
      if (board[x][y] == 1) {
      fill(255);
       } else {
        fill(0); 
   }
        rect(x*sideLength, y*sideLength, sideLength, sideLength);
   }
  }
}
