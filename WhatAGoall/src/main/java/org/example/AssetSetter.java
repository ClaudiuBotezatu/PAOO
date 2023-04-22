package org.example;

import object.OBJ_Ball;

public class AssetSetter {

    GamePanel gp;
    public AssetSetter(GamePanel gp)
    {
        this.gp = gp;
    }
    public void setObject()
    {
        gp.obj[0] = new OBJ_Ball();
        gp.obj[0].worldX = 27 * gp.tileSize;
        gp.obj[0].worldY = 17 * gp.tileSize;


    }
}
