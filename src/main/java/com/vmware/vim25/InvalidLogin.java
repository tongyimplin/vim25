package com.vmware.vim25;

import com.vmware.vim25.InvalidClientCertificate;
import com.vmware.vim25.PasswordExpired;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidLogin")
@XmlSeeAlso({InvalidClientCertificate.class, PasswordExpired.class})
public class InvalidLogin extends VimFault {}
