package com.vmware.vim25;

import com.vmware.vim25.HostActiveDirectoryInfo;
import com.vmware.vim25.HostAuthenticationStoreInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDirectoryStoreInfo")
@XmlSeeAlso({HostActiveDirectoryInfo.class})
public class HostDirectoryStoreInfo extends HostAuthenticationStoreInfo {}
