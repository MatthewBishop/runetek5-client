import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static526 {

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	public static int anInt8067 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)Z")
	public static boolean method7073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
