package com.vmware.vim25;

import com.vmware.vim25.PatchBinariesNotFound;
import com.vmware.vim25.VimFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatchBinariesNotFound", propOrder = {"patchID", "binary"})
public class PatchBinariesNotFound extends VimFault {
  @XmlElement(required = true)
  protected String patchID;
  
  protected List<String> binary;
  
  public String getPatchID() {
    return this.patchID;
  }
  
  public void setPatchID(String paramString) {
    this.patchID = paramString;
  }
  
  public List<String> getBinary() {
    if (this.binary == null)
      this.binary = new ArrayList<>(); 
    return this.binary;
  }
}
