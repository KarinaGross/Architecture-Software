package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changedObservers;

    public ModelStore(IModelChangedObserver[] changedObservers) {
        this.changedObservers = changedObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

    }

    public void addPoligonalModel(PoligonalModel model) {
        models.add(model);
    }

    public void addScene(Scene scene) {
        scenes.add(scene);
    }

    public void addFlash(Flash flash) {
        flashes.add(flash);
    }

    public void addCamera(Camera camera) {
        cameras.add(camera);
    }

    public Scene getScene(int id) {
        return this.scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
    }

}
