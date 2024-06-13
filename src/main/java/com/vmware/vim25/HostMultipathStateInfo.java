package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMultipathStateInfo;
import com.vmware.vim25.HostMultipathStateInfoPath;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMultipathStateInfo", propOrder = {"path"})
public class HostMultipathStateInfo extends DynamicData {
  protected List<HostMultipathStateInfoPath> path;
  
  public List<HostMultipathStateInfoPath> getPath() {
    if (this.path == null)
      this.path = new ArrayList<>(); 
    return this.path;
  }
}
