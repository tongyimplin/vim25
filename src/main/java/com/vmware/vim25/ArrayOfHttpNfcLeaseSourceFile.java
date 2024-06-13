package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHttpNfcLeaseSourceFile;
import com.vmware.vim25.HttpNfcLeaseSourceFile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHttpNfcLeaseSourceFile", propOrder = {"httpNfcLeaseSourceFile"})
public class ArrayOfHttpNfcLeaseSourceFile {
  @XmlElement(name = "HttpNfcLeaseSourceFile")
  protected List<HttpNfcLeaseSourceFile> httpNfcLeaseSourceFile;
  
  public List<HttpNfcLeaseSourceFile> getHttpNfcLeaseSourceFile() {
    if (this.httpNfcLeaseSourceFile == null)
      this.httpNfcLeaseSourceFile = new ArrayList<>(); 
    return this.httpNfcLeaseSourceFile;
  }
}
