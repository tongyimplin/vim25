package com.vmware.vim25;

import com.vmware.vim25.HttpNfcLeaseGetManifestResponse;
import com.vmware.vim25.HttpNfcLeaseManifestEntry;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "HttpNfcLeaseGetManifestResponse")
public class HttpNfcLeaseGetManifestResponse {
  protected List<HttpNfcLeaseManifestEntry> returnval;
  
  public List<HttpNfcLeaseManifestEntry> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
