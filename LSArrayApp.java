class LoadShedArrayApp
{
    public static void main (String[] args)
    {
        if (args.length == 3)
           (new LSArray ()).printArea (args[0], args[1], args[2]);
       else
           (new LSArray ()).printAllAreas ();        
    }


}