package ydeEx;

import java.util.ArrayList;
import java.util.Arrays;

import library.StdDraw;
import library.StdOut;
import library.StdRandom;
import yiDianEr.Point2D;

public class Yi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        StdDraw.setPenRadius(0.005);
        StdDraw.enableDoubleBuffering();
        StdDraw.setPenColor(StdDraw.RED);

        int N= Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            double y = Math.random();
            points[i] = new Point2D(x, y);
            points[i].draw();
        }
        ArrayList<Double>list=new ArrayList<Double>();
        for (int i = 0; i < points.length; i++) {
			for (int j = i+1; j < points.length; j++) {
				list.add(points[j].distanceTo(points[i]));
			}
		}
        Arrays.sort(list.toArray());
        StdDraw.show();
		StdOut.println(list.get(0));
	}

}
