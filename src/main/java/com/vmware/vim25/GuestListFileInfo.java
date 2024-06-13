package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestFileInfo;
import com.vmware.vim25.GuestListFileInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestListFileInfo", propOrder = {"files", "remaining"})
public class GuestListFileInfo extends DynamicData {
  protected List<GuestFileInfo> files;
  
  protected int remaining;
  
  public List<GuestFileInfo> getFiles() {
    if (this.files == null)
      this.files = new ArrayList<>(); 
    return this.files;
  }
  
  public int getRemaining() {
    return this.remaining;
  }
  
  public void setRemaining(int paramInt) {
    this.remaining = paramInt;
  }
}
