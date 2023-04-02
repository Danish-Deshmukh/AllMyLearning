package section12Generics.G2GenericsChallenge;

import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable> {

    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<T>(List.of(layerElements));
    }
    public void addElemets(T... elements) {
        layerElements.addAll(List.of(elements));
    }

    public void rederLayer() {
        for (T element : layerElements) {
            element.render();
        }
    }


}
