package Services;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Classes.Module;

class ModuleServices {
    private List<Module> Modules = new ArrayList<>();

    public void addModule(Module Module) {
        Modules.add(Module);
    }

    public void deleteModule(Module Module) {
        Modules.remove(Module);
    }

    public void updateModule(Module oldModule, Module newModule) {
        Iterator<Module> iterator = Modules.iterator();
        while (iterator.hasNext()) {
            Module currentModule = iterator.next();
            if (currentModule.equals(oldModule)) {
                iterator.remove();
                Modules.add(newModule);
                break;
            }
        }
    }


    public List<Module> getAllModules() {
        return Modules;
    }
}
