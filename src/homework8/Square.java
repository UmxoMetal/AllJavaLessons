package homework8;
import homework8_2.Figure;
import homework8_2.Painter;

public class Square implements Figure, Painter {
	
	public Square(Point bottomLeft, Point topRigth) {
        // TODO определить создание квадрата по двум точкам,
        // TODO при этом если точки заданы не корректно сообщение об этом на экран.
		
    }

    public Square(Point bottomLeft, Integer sideLength) {
        // TODO определить создание квадрата по точке и длине стороны
    }
    
    @Override
	public void draw(Painter painter) {
		
	}

	@Override
	public void drawline(Point from, Point to) {
		
	}

	public Point getTopLeft() {
        // TODO возврат координаты верхнего левого угла
        return null;
    }

    public Point getTopRigth() {
        // TODO возврат координаты верхнего правого угла
        return null;
    }

    public Point getBottomLeft() {
        // TODO возврат координаты нижнего левого угла
        return null;
    }

    public Point getBottomRight() {
        // TODO возврат координаты нижнего правого угла
        return null;
    }

    public void setTopLeft(Point point) {
        // TODO изменение положения координаты левого верхнего угла
        // TODO весь квадрат должен сдвинуться относительно этого угла
    }

    public void setTopRight(Point point) {
        // TODO также как и для setTopLeft только для правого верхнего угла
    }

    public void setBottomLeft(Point point) {
        // TODO также как и для setTopLeft только для левого нижнего угла
    }

    public void setBottomRight(Point point) {
        // TODO также как и для setTopLeft только для правого нижнего угла
    }
}
