/*
   SwingWT
   Copyright(c)2003-2008, R. Rawson-Tetley

   For more information on distributing and using this program, please
   see the accompanying "COPYING" file.

   Contact me by electronic mail: bobintetley@users.sourceforge.net

*/
package swingwt.awt.image;

import java.util.Hashtable;

public interface ImageConsumer {

    int IMAGEERROR = 1;
    int SINGLEFRAMEDONE = 2;
    int STATICIMAGEDONE = 3;
    int IMAGEABORTED = 4;
    int RANDOMPIXELORDER = 1;
    int TOPDOWNLEFTRIGHT = 2;
    int COMPLETESCANLINES = 4;
    int SINGLEPASS = 8;
    int SINGLEFRAME = 16;
    
    void setDimensions(int width, int height);
    void setProperties(Hashtable props);
    void setColorModel(ColorModel model);
    void setHints(int hintflags);
    void setPixels(int x, int y, int w, int h, ColorModel model, byte pixels[], int off, int scansize);
    void setPixels(int x, int y, int w, int h, ColorModel model, int pixels[], int off, int scansize);
    void imageComplete(int status);
    
}
