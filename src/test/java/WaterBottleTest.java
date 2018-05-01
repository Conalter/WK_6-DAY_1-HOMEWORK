public class WaterBottleTest {

    @Before
    public void before(){
        testBottle = new WaterBottle();
    }

    @Test
    public void hasVolumeStartsAt100(){
        assertEquals(100, testBottle.getVolume());
    }

    @Test
    public void drinkFromBottle(){
        testBottle.drink();
        assertEquals(90, testBottle.getVolume());
        testBottle.drink();
        assertEquals(80, testBottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        testBottle.empty();
        assertEquals(0, tetBottle.empty());
    }
}