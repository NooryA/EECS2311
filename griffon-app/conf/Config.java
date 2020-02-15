import griffon.util.AbstractMapResourceBundle;

import javax.annotation.Nonnull;
import java.util.Map;

import static java.util.Arrays.asList;
import static griffon.util.CollectionUtils.map;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        map(entries)
                .e("application",
                        map().e("title", "venn-griffon").e("startupGroups", asList("vennGriffon")).e("autoShutdown",
                                true))
                .e("mvcGroups",
                        map().e("vennGriffon",
                                map().e("model", "org.example.VennGriffonModel")
                                        .e("view", "org.example.VennGriffonView")
                                        .e("controller", "org.example.VennGriffonController")));
    }
}