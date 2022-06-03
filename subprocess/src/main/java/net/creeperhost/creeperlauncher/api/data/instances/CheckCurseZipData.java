package net.creeperhost.creeperlauncher.api.data.instances;

import net.creeperhost.creeperlauncher.api.data.BaseData;

public class CheckCurseZipData extends BaseData {
    public String path;

    public static class Reply extends CheckCurseZipData {
        public boolean success;
        public String message;
        
        public Reply(CheckCurseZipData data, boolean success, String message) {
            this.type = "CheckCurseZipDataReply";
            this.requestId = data.requestId;

            this.success = success;
            this.message = message;
        }
    }
}