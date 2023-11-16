package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Object method1(Object obj) {
        return obj;
    }

    public Object method2(Object obj1, Object obg2) {
        return obj1;
    }

    public void addPoligonalModel(PoligonalModel model) {
        models.add(model);
    }

    public void addFlash(Flash flash) {
        flashes.add(flash);
    }

    public void addCamera(Camera camera) {
        cameras.add(camera);
    }
}
