package sigma.ligma.blacklistfricker.mixin;

import com.mojang.patchy.MojangBlockListSupplier;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.function.Predicate;

@Mixin(MojangBlockListSupplier.class)
public abstract class RemoveFilterMixin {
    /**
     * @author someone else probably
     * @reason makes it not block any servers
     */
    @Overwrite(remap = false)
    public Predicate<String> createBlockList() {
        return input -> false;
    }
}