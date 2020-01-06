package computer.parts.ram;

import computer.parts.ram.api.IKingston;
import computer.standart.ram.api.RAMStandard;

public class Kingston implements IKingston {
    private Kingston kingston;
    private RAMStandard ramStandard;

    @Override
    public boolean test() {
        return String.valueOf(kingston).equals(String.valueOf(ramStandard));
    }
}
