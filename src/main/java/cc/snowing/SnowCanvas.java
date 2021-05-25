package cc.snowing;

import java.awt.*;

public class SnowCanvas extends Canvas{

    public SnowCanvas(){
        setBackground(Color.BLACK);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.drawString("雪", 50, 50);
    }
}
