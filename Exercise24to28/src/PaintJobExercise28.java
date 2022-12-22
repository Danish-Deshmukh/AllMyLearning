public class PaintJobExercise28 {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,1.5));
    }
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBucket){
//        double bucketRequred;
        if (( width<=0)||(height <=0)||(areaPerBucket <=0)||(extraBucket <=0)) return -1;
        else {
//            bucketRequred= ((width*height)/areaPerBucket)-(double)extraBucket;
            return (int) Math.ceil((width*height-(areaPerBucket*extraBucket))/areaPerBucket);
        }
//        return (int)Math.ceil(bucketRequred);
    }
    public static int getBucketCount (double width, double height, double areaPerBucket){
//        if ((width <= 0)||(height <= 0)||(areaPerBucket<= 0)) return -1;
        return getBucketCount(width,height,areaPerBucket,0);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        return getBucketCount(area,1,areaPerBucket,0);
    }
}
