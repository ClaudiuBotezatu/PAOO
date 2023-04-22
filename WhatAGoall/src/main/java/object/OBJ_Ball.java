package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Ball  extends SuperObject{
    public OBJ_Ball()
    {
        name = "Ball";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/Ball.png"));

        }catch(IOException e)
        {
            e.printStackTrace();
        }
        collision = true;
    }
}
