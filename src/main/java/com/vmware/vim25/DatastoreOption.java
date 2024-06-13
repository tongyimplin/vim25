package com.vmware.vim25;

import com.vmware.vim25.DatastoreOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineDatastoreVolumeOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreOption", propOrder = {"unsupportedVolumes"})
public class DatastoreOption extends DynamicData {
  protected List<VirtualMachineDatastoreVolumeOption> unsupportedVolumes;
  
  public List<VirtualMachineDatastoreVolumeOption> getUnsupportedVolumes() {
    if (this.unsupportedVolumes == null)
      this.unsupportedVolumes = new ArrayList<>(); 
    return this.unsupportedVolumes;
  }
}
