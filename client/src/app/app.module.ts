import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AgmCoreModule } from '@agm/core';

import { AppComponent } from './app.component';
import { IndexComponent } from './index/index.component';

import { ConstantsService} from './services/constants.service'


@NgModule({
  declarations: [
    AppComponent,
    IndexComponent
  ],
  imports: [
    BrowserModule,
    AgmCoreModule.forRoot({
      apiKey: ConstantsService.googleApiKey
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
