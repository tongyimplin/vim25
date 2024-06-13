package com.vmware.vim25;

import com.vmware.vim25.PatchMetadataCorrupted;
import com.vmware.vim25.PatchMetadataInvalid;
import com.vmware.vim25.PatchMetadataNotFound;
import com.vmware.vim25.VimFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatchMetadataInvalid", propOrder = {"patchID", "metaData"})
@XmlSeeAlso({PatchMetadataNotFound.class, PatchMetadataCorrupted.class})
public class PatchMetadataInvalid extends VimFault {
  @XmlElement(required = true)
  protected String patchID;
  
  protected List<String> metaData;
  
  public String getPatchID() {
    return this.patchID;
  }
  
  public void setPatchID(String paramString) {
    this.patchID = paramString;
  }
  
  public List<String> getMetaData() {
    if (this.metaData == null)
      this.metaData = new ArrayList<>(); 
    return this.metaData;
  }
}
