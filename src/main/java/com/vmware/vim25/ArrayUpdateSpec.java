package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateOperation;
import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.ClusterDasVmConfigSpec;
import com.vmware.vim25.ClusterDpmHostConfigSpec;
import com.vmware.vim25.ClusterDrsVmConfigSpec;
import com.vmware.vim25.ClusterGroupSpec;
import com.vmware.vim25.ClusterRuleSpec;
import com.vmware.vim25.ClusterVmOrchestrationSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StorageDrsOptionSpec;
import com.vmware.vim25.StorageDrsVmConfigSpec;
import com.vmware.vim25.VAppOvfSectionSpec;
import com.vmware.vim25.VAppProductSpec;
import com.vmware.vim25.VAppPropertySpec;
import com.vmware.vim25.VirtualMachineCpuIdInfoSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayUpdateSpec", propOrder = {"operation", "removeKey"})
@XmlSeeAlso({ClusterRuleSpec.class, VAppPropertySpec.class, ClusterDasVmConfigSpec.class, StorageDrsVmConfigSpec.class, ClusterGroupSpec.class, ClusterDpmHostConfigSpec.class, ClusterDrsVmConfigSpec.class, StorageDrsOptionSpec.class, VAppOvfSectionSpec.class, VAppProductSpec.class, VirtualMachineCpuIdInfoSpec.class, ClusterVmOrchestrationSpec.class})
public class ArrayUpdateSpec extends DynamicData {
  @XmlElement(required = true)
  protected ArrayUpdateOperation operation;
  
  protected Object removeKey;
  
  public ArrayUpdateOperation getOperation() {
    return this.operation;
  }
  
  public void setOperation(ArrayUpdateOperation paramArrayUpdateOperation) {
    this.operation = paramArrayUpdateOperation;
  }
  
  public Object getRemoveKey() {
    return this.removeKey;
  }
  
  public void setRemoveKey(Object paramObject) {
    this.removeKey = paramObject;
  }
}
