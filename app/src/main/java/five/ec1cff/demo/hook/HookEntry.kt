package five.ec1cff.demo.hook

import com.highcapable.yukihookapi.annotation.xposed.InjectYukiHookWithXposed
import com.highcapable.yukihookapi.hook.xposed.proxy.IYukiHookXposedInit
import five.ec1cff.demo.BuildConfig

@InjectYukiHookWithXposed(modulePackageName = BuildConfig.APPLICATION_ID)
class HookEntry : IYukiHookXposedInit {
    override fun onHook() {
        TODO("Not yet implemented")
    }
}
