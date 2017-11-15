import { Component, OnInit } from '@angular/core';
import { ConstantsService} from './../services/constants.service'


@Component({
  selector: 'app-index',
  templateUrl: './index.component.html'
})
export class IndexComponent implements OnInit {

  url: String;

  constructor() {
  		this.url = ConstantsService.apiEndpoint;
   }

  ngOnInit() {

  }

}
