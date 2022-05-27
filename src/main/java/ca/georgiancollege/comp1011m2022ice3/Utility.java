package ca.georgiancollege.comp1011m2022ice3;

/**
 *
 * Name - Diya Diya
 * Student number - 200489015
 * Course - COMP 1011
 * Semester - 3
 *
 * */
public class Utility
{
    /*
     * This method returns the distance from start to end
     * @param start = start vector2D
     * @param end = ending vector2D
     * */
    public static float distance(Vector2D start, Vector2D end)
    {
        float diffXs = end.getX() - start.getX();
        float diffYs = end.getY() - start.getY();
        return (float) Math.sqrt(diffXs * diffXs + diffYs * diffYs);
    }

    public static float distance(float x1, float y1, float x2, float y2)
    {
        float diffXs = x2 - x1;
        float diffYs = y2 - y1;
        return (float) Math.sqrt(diffXs * diffXs + diffYs * diffYs);
    }


}
