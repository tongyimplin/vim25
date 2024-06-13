package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.VVolVmConfigFileUpdateResult;
import com.vmware.vim25.VVolVmConfigFileUpdateResultFailedVmConfigFileInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VVolVmConfigFileUpdateResult", propOrder = {"succeededVmConfigFile", "failedVmConfigFile"})
public class VVolVmConfigFileUpdateResult extends DynamicData {
  protected List<KeyValue> succeededVmConfigFile;
  
  protected List<VVolVmConfigFileUpdateResultFailedVmConfigFileInfo> failedVmConfigFile;
  
  public List<KeyValue> getSucceededVmConfigFile() {
    if (this.succeededVmConfigFile == null)
      this.succeededVmConfigFile = new ArrayList<>(); 
    return this.succeededVmConfigFile;
  }
  
  public List<VVolVmConfigFileUpdateResultFailedVmConfigFileInfo> getFailedVmConfigFile() {
    if (this.failedVmConfigFile == null)
      this.failedVmConfigFile = new ArrayList<>(); 
    return this.failedVmConfigFile;
  }
}
