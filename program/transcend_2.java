//T319035 kibune sohta
//T319058 tanikawa ayaka
//T319059 tanimoto juki

public class transcend_2 {
  public static void main(String args[]) {
    Checkers.Numbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]),
        Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]),
        Integer.parseInt(args[7]));// コマンドラインから入力
  }
}

class Checkers {
  public static void Numbers(int LineStart_x, int LineStart_y, int LineEnd_x, int LineEnd_y, int RectLeft_x,
      int RectTop_y, int RectRight_x, int RectBottom_y) {
    int flag1 = 0;
    int flag2 = 0;
    flag1 = check(LineStart_x, LineStart_y, LineEnd_x, LineEnd_y, RectLeft_x, RectTop_y, RectRight_x, RectTop_y);// 線分と四角形の上の辺
    if (flag1 == 1)// Tならflag2を1にする
    {
      flag2 = 1;
    }
    flag1 = check(LineStart_x, LineStart_y, LineEnd_x, LineEnd_y, RectRight_x, RectTop_y, RectRight_x, RectBottom_y);// 線分と四角形の右の辺
    if (flag1 == 1)// Tならflag2を1にする
    {
      flag2 = 1;
    }
    flag1 = check(LineStart_x, LineStart_y, LineEnd_x, LineEnd_y, RectRight_x, RectBottom_y, RectLeft_x, RectBottom_y);// 線分と四角形の下の辺
    if (flag1 == 1)// Tならflag2を1にする
    {
      flag2 = 1;
    }
    flag1 = check(LineStart_x, LineStart_y, LineEnd_x, LineEnd_y, RectLeft_x, RectBottom_y, RectLeft_x, RectTop_y);// 線分と四角形の左の辺
    if (flag1 == 1)// Tならflag2を1にする
    {
      flag2 = 1;
    }
    if (flag2 == 1) {
      System.out.println("T");
    } else {
      System.out.println("F");
    }

  }

  public static int check(int ax, int ay, int bx, int by, int cx, int cy, int dx, int dy) {
    // 直線に対して、両側に二つの点が存在するときに直線と線分は交差する
    int a1 = (cx - dx) * (ay - cy) + (cy - dy) * (cx - ax);// (cx,cy),(dx,dy)を通る直線に(ax,ay)を代入
    int b1 = (cx - dx) * (by - cy) + (cy - dy) * (cx - bx);// (cx,cy),(dx,dy)を通る直線に(bx,by)を代入
    int c1 = (ax - bx) * (cy - ay) + (ay - by) * (ax - cx);// (ax,ay),(bx,by)を通る直線に(cx,cy)を代入
    int d1 = (ax - bx) * (dy - ay) + (ay - by) * (ax - dx);// (ax,ay),(bx,by)を通る直線に(dx,dy)を代入

    if (c1 * d1 <= 0 && a1 * b1 <= 0)// 符号が異なれば
    {
      return 1;
    } 
    else 
    {
      return 0;
    }
  }
}