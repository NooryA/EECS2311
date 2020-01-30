package org.example;

import javax.inject.Named;
import griffon.core.mvc.MVCGroup;
import org.codehaus.griffon.runtime.core.mvc.AbstractTypedMVCGroup;
import javax.annotation.Nonnull;

@Named("vennGriffon")
public class VennGriffonMVCGroup extends AbstractTypedMVCGroup<VennGriffonModel, VennGriffonView, VennGriffonController> {
    public VennGriffonMVCGroup(@Nonnull MVCGroup delegate) {
        super(delegate);
    }
}